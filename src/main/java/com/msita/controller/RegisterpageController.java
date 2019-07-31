package com.msita.controller;

import com.msita.entity.CustomerEntity;
import com.msita.form.RegisterForm;
import com.msita.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterpageController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/register")
    public String registerCustomer(final Model model){
        model.addAttribute("registerForm" , new RegisterForm());
        return "register";
    }
    @PostMapping("/register")
    public String doRegisterCustomer(@Valid @ModelAttribute("registerForm") final RegisterForm registerForm , BindingResult errors, final Model model){
        if (errors.hasErrors()){
            model.addAttribute("message" , "Vui long sua cac loi sau");
            return "register";
        }
        if (!registerForm.getPassword().equals(registerForm.getConfirm_password())){
            errors.rejectValue("checkPassword" , "Student" , "Nhap lai mat khau khong dung!");
        }
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setEmail(registerForm.getEmail());
        customerEntity.setPassword(registerForm.getPassword());
        customerEntity.setEncode_password(registerForm.getConfirm_password());
        customerEntity.setFirst_name(registerForm.getFirst_name());
        customerEntity.setLast_name(registerForm.getLast_name());
        customerEntity.setGender(registerForm.getGender());
        customerEntity.setPhone_number(registerForm.getPhone_number());
        customerService.registerCustomer(customerEntity);
        return "redirect:/";
    }
    @ModelAttribute("genders")
    public Map<String , String> getGenders(){
        Map<String, String>genders = new HashMap<String, String>();
        genders.put("M" , "Male");
        genders.put("F" , "Female");
        return genders;
    }
}

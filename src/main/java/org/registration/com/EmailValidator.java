//package org.registration.com;
//
//
//import jakarta.faces.application.FacesMessage;
//import jakarta.faces.component.UIComponent;
//import jakarta.faces.context.FacesContext;
//import jakarta.faces.validator.FacesValidator;
//import jakarta.faces.validator.ValidatorException;
//
//@FacesValidator("emailValidator")
//public class EmailValidator {
//    @Override
//    public void validate(FacesContext context, UIComponent component, String email) throws
//            ValidatorException{
//        if(email == null || email.isBlank()){
//        return;
//        }
//        if (!email.contains("@")){
//            throw new ValidatorException(
//                    new FacesMessage("Email must contain '@'. ")
//            );
//        }
//    }String[] parts = email.split("@");
//    if
//}

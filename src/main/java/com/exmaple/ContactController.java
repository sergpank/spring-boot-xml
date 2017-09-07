package com.exmaple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/contact")
public class ContactController {
    final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping("/random")
    @ResponseBody
    public Contact randomContact() {
        return Contact.randomContact();
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Contact editContact(@RequestBody Contact contact) {
        logger.info("Received contact: {}", contact);
        contact.setFirstName(contact.getFirstName() + "-EDITED");
        return contact;
    }
}

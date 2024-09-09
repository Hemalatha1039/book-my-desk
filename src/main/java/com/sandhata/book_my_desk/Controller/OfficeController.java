package com.sandhata.book_my_desk.Controller;

import com.sandhata.book_my_desk.Entity.Office;
import com.sandhata.book_my_desk.Service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/offices")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @GetMapping
    public List<Office> getOffices()
    {
        return officeService.getOffices();
    }

}

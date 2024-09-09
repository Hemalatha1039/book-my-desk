package com.sandhata.book_my_desk.Service;

import com.sandhata.book_my_desk.Entity.Office;
import com.sandhata.book_my_desk.Repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService{

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public List<Office> getOffices() {
        return officeRepository.findAll();
    }
}

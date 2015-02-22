package com.yodiyanwar.controller;

import com.yodiyanwar.model.Mahasiswa;
import com.yodiyanwar.service.MahasiswaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Yodi Yanwar
 */
@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {
    
    @Autowired
    MahasiswaService mhsService;
    
    @ResponseBody
    @RequestMapping(value = "mahasiswa.json", method = RequestMethod.GET)
    public List<Mahasiswa> getAllMhs(){
        return mhsService.getAll();
    }
    
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Mahasiswa mhs){
        mhsService.add(mhs);
    }
    
    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)    
    public void edit(@RequestBody Mahasiswa mhs){
        mhsService.edit(mhs);
    }   
    
    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)    
    public void edit(@PathVariable Integer id){
        mhsService.delete(id);
    }
    
    @RequestMapping("/mahasiswa")
    public String page(ModelMap model){
        return "pages/mahasiswa";
    }
    
}

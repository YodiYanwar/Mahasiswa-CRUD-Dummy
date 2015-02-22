package com.yodiyanwar.service;

import com.yodiyanwar.model.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yodi Yanwar
 */
@Service
public class MahasiswaServiceImpl implements MahasiswaService {
    
    private static List<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
    private Integer id = 0;
    
    public Mahasiswa findMhsById(Integer id){
        for(Mahasiswa mhs : listMahasiswa){
            if(mhs.getId() == id){
                return mhs;
            }
        }
        return null;
    }
    
    public List<Mahasiswa> getAll(){
        return listMahasiswa;
    }
    
    public void add(Mahasiswa mhs){
        mhs.setId(++id);
        listMahasiswa.add(mhs);
    }
    
    public void edit(Mahasiswa mhs){
        Mahasiswa foundMhs = findMhsById(mhs.getId());
        if(foundMhs != null){
            listMahasiswa.remove(foundMhs);
            listMahasiswa.add(mhs);
        }
    }
    
    public void delete(Integer id){
        Mahasiswa foundMhs = findMhsById(id);
        if(foundMhs != null){
            listMahasiswa.remove(foundMhs);
        }
    }
    
    public Mahasiswa getMhs(Integer id){
        return findMhsById(id);
    }  
}

package service.impl;

import dao.PetDao;
import entity.Pet;
import org.springframework.stereotype.Service;
import service.MyService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ServiceImpl implements MyService {
    @Resource
    private PetDao dao;
    @Override
    public List<Pet> selectAll() {
        List<Pet> list = dao.queryPetAll();
        return list;
    }
}

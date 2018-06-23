package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entity.DigitalAccount;
import com.example.demo.repository.DigitalAccountRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.x.json.JsonArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/digitalAccount")
public class DigitalAccountController {


    @Autowired
    private DigitalAccountRepository digitalAccountRepository;


    /**
     * 数字账户列表查询
     * @param pageable
     * @param getDigitalAccountRequestDTO
     * @return
     */
    @CrossOrigin
    @GetMapping
    public MiniUIPageDTO get(@PageableDefault Pageable pageable , GetDigitalAccountRequestDTO getDigitalAccountRequestDTO){

        try{
            Page<DigitalAccount> digitalAccountPage = this.digitalAccountRepository.findAll(new Specification<DigitalAccount>() {
                @Nullable
                @Override
                public Predicate toPredicate(Root<DigitalAccount> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

                    List<Predicate> predicateList = new ArrayList<>();
                    String name = getDigitalAccountRequestDTO.getName();

                    String url = getDigitalAccountRequestDTO.getUrl();

                    String remark = getDigitalAccountRequestDTO.getRemark();

                    String password = getDigitalAccountRequestDTO.getPassword();

                    String username = getDigitalAccountRequestDTO.getUsername();

                    if(!StringUtils.isEmpty(name)){
                        predicateList.add(cb.like(root.get("name") , "%" + name + "%"));
                    }
                    if(!StringUtils.isEmpty(url)){
                        predicateList.add(cb.like(root.get("url") , "%" + url + "%"));
                    }
                    if(!StringUtils.isEmpty(remark)){
                        predicateList.add(cb.like(root.get("remark") , "%" + remark + "%"));
                    }
                    if(!StringUtils.isEmpty(password)){
                        predicateList.add(cb.like(root.get("password") , "%" + password + "%"));
                    }
                    if(!StringUtils.isEmpty(username)){
                        predicateList.add(cb.like(root.get("username") , "%" + username + "%"));
                    }


                    return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));
                }
            } , pageable);
            return MiniUIPageDTO.builder()
                    .data(digitalAccountPage.getContent())
                    .total(digitalAccountPage.getTotalElements())
                    .build();
        }catch (Exception e){
            e.printStackTrace();
            return MiniUIPageDTO.builder()
                    .isSuccess(Boolean.FALSE)
                    .message(e.getMessage())
                    .build();
        }

    }
    @CrossOrigin
    @PostMapping
    public ResultDTO post(@RequestBody DigitalAccount digitalAccount){
        try{

            this.digitalAccountRepository.save(digitalAccount);

            return ResultDTO.builder()
                    .build();
        }catch (Exception e){
            e.printStackTrace();
            return ResultDTO.builder()
                    .isSuccess(Boolean.FALSE)
                    .message(e.getMessage())
                    .build();
        }

    }
    @CrossOrigin
    @PutMapping
    public ResultDTO put(@RequestBody DigitalAccount digitalAccount){
        try{

            this.digitalAccountRepository.save(digitalAccount);

            return ResultDTO.builder()
                    .build();
        }catch (Exception e){
            e.printStackTrace();
            return ResultDTO.builder()
                    .isSuccess(Boolean.FALSE)
                    .message(e.getMessage())
                    .build();
        }

    }


    @CrossOrigin
    @DeleteMapping(value = "/batchDelete")
    public ResultDTO batchDelete(@RequestBody List<Integer> ids){
        try{

            if(!CollectionUtils.isEmpty(ids)){
                for(Integer id : ids){
                    this.digitalAccountRepository.deleteById(id);
                }
            }

            return ResultDTO.builder()
                    .build();
        }catch (Exception e){
            e.printStackTrace();
            return ResultDTO.builder()
                    .isSuccess(Boolean.FALSE)
                    .message(e.getMessage())
                    .build();
        }

    }


    @CrossOrigin
    @PostMapping(value = "/batchInsertOrUpdate")
    public ResultDTO batchInsertOrUpdate(@RequestBody  List<BatchDomain> batchDomains){
        try{
            if(!CollectionUtils.isEmpty(batchDomains)){
                for(BatchDomain domain : batchDomains){

                    DigitalAccount digitalAccount = new DigitalAccount();
                    BeanUtils.copyProperties(domain , digitalAccount);
//                    DigitalAccount digitalAccount = (DigitalAccount)domain;
                    this.digitalAccountRepository.save(digitalAccount);
//                    if(domain.get_state().equalsIgnoreCase("modified")){
//                        //解决前置查询bug
//                    }else if(domain.get_state().equalsIgnoreCase("added")){
//
//                    }
                }
            }
            return ResultDTO.builder()
                    .build();
        }catch (Exception e){
            e.printStackTrace();
            return ResultDTO.builder()
                    .isSuccess(Boolean.FALSE)
                    .message(e.getMessage())
                    .build();
        }

    }
}

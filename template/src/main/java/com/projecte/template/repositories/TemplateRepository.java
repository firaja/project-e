package com.projecte.template.repositories;

import org.springframework.data.repository.CrudRepository;

import com.projecte.template.entities.TemplateEntity;


public interface TemplateRepository extends CrudRepository<TemplateEntity, String>
{
    //
}

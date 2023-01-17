package com.example.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.constant.Constants;
import com.example.dto.TaskDTO;
import com.example.service.TaskService;

import jakarta.annotation.Resource;


@RestController
@RequestMapping("/springh2")
public class TaskController {
	
@Resource
TaskService service;

@RequestMapping(value = "/list-task")
public ModelAndView showTodos(ModelMap model) {
	model.put(Constants.TASK_OBJ, service.retrieveTask());
	return new ModelAndView(Constants.LIST_TASK);
}

	@RequestMapping(value = "/add-task")
	public ModelAndView addTask(ModelMap model, TaskDTO taskdto, BindingResult result) {
		service.addTask(taskdto);
		model.addAttribute(Constants.TASK, taskdto);
		if (result.hasErrors()) {
			return new ModelAndView(Constants.LIST_TASK); 
		}
		return new ModelAndView(Constants.ADD_TASK);
		
	}
	
}

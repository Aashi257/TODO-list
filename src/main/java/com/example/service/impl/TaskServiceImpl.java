package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.TaskDTO;
import com.example.mapper.DataMapper;
import com.example.model.Task;
import com.example.repositories.TaskRepository;
import com.example.service.TaskService;

import jakarta.annotation.Resource;

@Service
public class TaskServiceImpl implements TaskService {


	@Resource 
	DataMapper mapper;
	
	@Resource
	TaskRepository taskRepository;
	
	@Override
	public List<TaskDTO> retrieveTask() {
		List<TaskDTO> dtoList = new ArrayList<>();
		List<Task> taskList = new ArrayList<>();
		for (Task task : taskList) {
			dtoList.add(mapper.TaskMapper(task));
		}
		return dtoList;

	}
	
		@Override
		public void addTask(TaskDTO dto) {
			Task task = mapper.TaskConverter(dto);
			List<Task> list = new ArrayList<>();
			list.add(task);
			taskRepository.saveAll(list);
		}
		
}

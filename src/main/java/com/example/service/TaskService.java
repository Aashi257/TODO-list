package com.example.service;

import java.util.List;

import com.example.dto.TaskDTO;

public interface TaskService {
		
		public List<TaskDTO> retrieveTask();
		
		public void addTask(TaskDTO dto);
		
		 
	}

package com.example.mapper;

import org.springframework.stereotype.Component;

import com.example.dto.TaskDTO;
import com.example.model.Task;

@Component
public class DataMapper {
	
		public TaskDTO TaskMapper(Task task) {
			TaskDTO taskDTO = new TaskDTO();
			taskDTO.setTaskId(task.getId());
			taskDTO.setDesc(task.getDesc());
			taskDTO.setName(task.getName());
			return taskDTO;

		}

		public Task TaskConverter(TaskDTO dto) {
			Task task = new Task();
			task.setId(dto.getTaskId());
			task.setDesc(dto.getDesc());
			task.setName(dto.getName());
			return task;

		}
}

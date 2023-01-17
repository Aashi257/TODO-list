package com.example.dto;

public class TaskDTO {
	
		private int taskId;
		private String taskCategory;
		private String name;
		private String desc;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTaskId() {
			return taskId;
		}

		public void setTaskId(int taskId) {
			this.taskId = taskId;
		}

		public String getTaskCategory() {
			return taskCategory;
		}

		public void setTaskCategory(String taskCategory) {
			this.taskCategory = taskCategory;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

}

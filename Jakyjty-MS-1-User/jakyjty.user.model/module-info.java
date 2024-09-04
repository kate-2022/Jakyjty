module user.model.Module {
	
	requires module user.dao.Module;
	//requires module exceptions.Module;
	uses IUserManagementService.name;
}
module user.model.Module {
	
	requires module user.dao.Module;
	//requires module exceptions.Module;
	//requires module authentication.Module;
	//requires module service.Module;
	uses IUserManagementService.name;
}
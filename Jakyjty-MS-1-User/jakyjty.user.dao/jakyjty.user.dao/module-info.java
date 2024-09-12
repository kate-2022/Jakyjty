module jakyjty.user.dao.Module {
	
	requires module jakyjty.user.model.Module;
	//requires module exceptions.Module;
	requires module jakyjty.session.Module;
	uses IUserManagementService.name;
}
module jakyjty.session.Module{
	
	requires module jakyjty.user.dao.Module;
	requires module jakyjty.user.model.Module;
	//requires module login.Module;
	//requires module exceptions.Module;
	uses IUserManagementService.name;
}
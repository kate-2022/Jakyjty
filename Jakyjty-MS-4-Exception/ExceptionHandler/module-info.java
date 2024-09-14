module jakyjty.exception.Module{
	
	requires module jakyjty.user.dao.Module;
	requires module jakyjty.user.model.Module;
	requires module session.Module;
	uses IUserManagementService.name;
}
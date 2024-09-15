module jakyjty.registration.Module{
	
	requires module jakyjty.user.dao.Module;
	requires module jakyjty.user.model.Module;
	requires module exception.Module;
	uses IUserManagementService.name;
}
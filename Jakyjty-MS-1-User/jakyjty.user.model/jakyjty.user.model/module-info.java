module jakyjty.user.model.Module {
	
	requires module jakyjty.user.dao.Module;
	requires module exception.Module;
	requires module jakyjty.session.Module;
	uses IUserManagementService.name;
}
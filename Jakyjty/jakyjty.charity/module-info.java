module charity.Module {
	
	requires module usersettings.Module;
	uses IUserManagementService.name;
	requires module clients.Module;
}
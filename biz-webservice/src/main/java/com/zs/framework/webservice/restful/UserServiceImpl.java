package com.zs.framework.webservice.restful;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

public class UserServiceImpl implements UserService {

	public User searchUser(String userId) {
		User user = null;// UserDAO.searchUser(userId);
		if (user == null) {
			ResponseBuilder builder = Response.status(Status.NOT_FOUND);
			builder.type("application/xml");
			builder.entity("<errorMsg>User with id:" + userId + " can not be found!</errorMsg>");
			throw new WebApplicationException(builder.build());
		} else {
			System.out.println("User with id:" + userId + " is found");
			return user;
		}

	}

	public Response addUser(User user) {
		User userObj = null;// (User) UserDAO.searchUser(user.getUserId());
		if (userObj != null) {
			ResponseBuilder builder = Response.status(Status.FORBIDDEN);
			builder.type("application/xml");
			builder.entity("<errorMsg>User with id:" + user.getUserId() + " already exists</errorMsg>");
			throw new WebApplicationException(builder.build());
		} else {
			// UserDAO.addUser(user);
			return Response.ok(user).build();
		}
	}

	public Response deleteUser(String userId) {
		User userObj = null; // (User) UserDAO.searchUser(userId);
		if (userObj == null) {
			ResponseBuilder builder = Response.status(Status.FORBIDDEN);
			builder.type("application/xml");
			builder.entity(
					"<errorMsg>User with id:" + userId + " is not existed, delettion request is rejected</errorMsg>");
			throw new WebApplicationException(builder.build());
		} else {
			// UserDAO.deleteUser(userId);
			return Response.ok().build();
		}
	}

	public Response updateUser(User user) {
		User userObj = null; // (User) UserDAO.searchUser(user.getUserId());
		if (userObj == null) {
			ResponseBuilder builder = Response.status(Status.FORBIDDEN);
			builder.type("application/xml");
			builder.entity("<errorMsg>User with id:" + user.getUserId()
					+ " is not existed, update request is rejected</errorMsg>");
			throw new WebApplicationException(builder.build());
		} else {
			// UserDAO.updateUser(user);
			return Response.ok(user).build();
		}
	}

	public Users getUsers(String startDate, String endDate) {
		List<User> userList = new ArrayList<User>();
		ResponseBuilder builder = Response.status(Status.OK);
		builder.type("application/xml");
		try {
			// userList = UserDAO.getUsersByRegDate(startDate, endDate);
		} catch (Exception e) {
			e.printStackTrace();
			builder = Response.status(Status.NOT_ACCEPTABLE);
			builder.entity("<errorMsg>" + "not accpertable date format for startDate or endDate</errorMsg>");
			throw new WebApplicationException(builder.build());
		}
		if (userList.size() < 1) {
			builder = Response.status(Status.NOT_FOUND);
			builder.entity(
					"<errorMsg>no user found registered between" + startDate + " and " + endDate + "</errorMsg>");
			throw new WebApplicationException(builder.build());
		} else {
			Users users = new Users();
			users.setUsers(userList);
			return users;
		}

	}
}

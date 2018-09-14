package com.fimc.hello.resource;

import java.text.DecimalFormat;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.fimc.hello.http.MessageResponse;
import com.fimc.hello.model.CalculatorRequest;
import com.fimc.hello.model.ServerResponse;

@Component
@Path("/calculator")
public class CalculatorResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculator(CalculatorRequest data) {
		MessageResponse http = new MessageResponse();
		CalculatorResponse res = new CalculatorResponse();
		ServerResponse success = new ServerResponse();
		if (res.getOperator(data.getOperator()).equals("invalid")) {
			http.setMessage("invalid operator");
			return Response.status(HttpServletResponse.SC_BAD_REQUEST).entity(http).build();
		} else {
			DecimalFormat df = new DecimalFormat("#.#####");
			success.setAction(res.getOperator(data.getOperator()));
			success.setResult(df.format(res.calculate(data)));
			return Response.ok().entity(success).build();
		}
	}

}

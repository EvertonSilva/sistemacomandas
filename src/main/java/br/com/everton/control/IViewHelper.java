package br.com.everton.control;

import br.com.everton.model.DomainEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by everton on 23/06/17.
 */
public interface IViewHelper {

    DomainEntity getEntity(HttpServletRequest req);

    void setView(Object object, HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException;
}

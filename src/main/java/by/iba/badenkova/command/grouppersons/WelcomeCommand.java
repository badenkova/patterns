package by.iba.badenkova.command.grouppersons;

import by.iba.badenkova.command.Command;
import by.iba.badenkova.command.CommandResult;
import by.iba.badenkova.exception.IncorrectDataException;
import by.iba.badenkova.exception.ServiceException;
import by.iba.badenkova.model.Person;
import by.iba.badenkova.service.PersonService;
import by.iba.badenkova.util.pages.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static by.iba.badenkova.command.grouppersons.constant.GroupConstant.LISTGROUP;

public class WelcomeCommand implements Command {
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse
            response)
            throws ServiceException, IncorrectDataException {
        PersonService personService = new PersonService();
        List<Person> clients = personService.findAll();
        if (!clients.isEmpty()) {
            request.setAttribute(LISTGROUP, clients);
        }
        return new CommandResult(Page.WELCOME_PAGE.getPage(), false);
    }
}

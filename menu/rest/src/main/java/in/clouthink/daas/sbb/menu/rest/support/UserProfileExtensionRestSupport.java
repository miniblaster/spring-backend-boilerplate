package in.clouthink.daas.sbb.menu.rest.support;

import in.clouthink.daas.sbb.account.domain.model.User;
import in.clouthink.daas.sbb.menu.rest.dto.MenuSummary;

import java.util.List;

/**
 *
 */
public interface UserProfileExtensionRestSupport {

	List<MenuSummary> getUserGrantedMenus(User user);

}
/*
 * JavamailCommand
 * Java Collections Source Code Examples
 * Copyright (C) 1999-2013  Massimo Caliman, 
 * mailto:mcaliman@caliman.biz
 * http://www.caliman.biz
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package biz.caliman.javamailcommand;

import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;

/**
 * @author Massimo Caliman, mcaliman@caliman.biz
 * @version %I%, %G%
 * @since 1.0
 */
public class AbstractMailCommand {

	/**
	 * Call to fix MaiCap problem.
	 * http://java.sun.com/j2ee/1.4/docs/api/javax/activation
	 * /MailcapCommandMap.html Add handlers for main MIME types
	 */
	protected void mailcap() {
		MailcapCommandMap mc = (MailcapCommandMap) CommandMap.getDefaultCommandMap();
		mc.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		CommandMap.setDefaultCommandMap(mc);
	}

}
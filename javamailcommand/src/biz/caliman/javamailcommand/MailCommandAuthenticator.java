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

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author Massimo Caliman, mcaliman@caliman.biz
 * @version %I%, %G%
 * @since 1.0
 */
public class MailCommandAuthenticator extends Authenticator {

	private String user;
	private String password;

	public MailCommandAuthenticator(String user, String password) {
		this.user = user;
		this.password = password;
	}

	@Override
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(this.user, this.password);
	}

}

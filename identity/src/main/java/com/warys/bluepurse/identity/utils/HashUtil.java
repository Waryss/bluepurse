package com.warys.bluepurse.identity.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import com.warys.bluepurse.identity.exception.IdentityErrorCode;
import com.warys.bluepurse.identity.exception.IdentityException;

public class HashUtil {

	public static String generateHash(String text) throws IdentityException {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(text.getBytes());
			byte[] digest = md.digest();
			return DatatypeConverter.printHexBinary(digest).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			throw new IdentityException(IdentityErrorCode.I100, e.getMessage());
		}
	}
}

package com.alessio.danny.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.alessio.danny.dao.EntryDao;
import com.alessio.danny.model.GuestBookEntry;

@Repository("entryDao")
public class EntryDaoImpl implements EntryDao {

	private Collection <GuestBookEntry> guestBookEntries = new ArrayList<>();
	
	public Collection <GuestBookEntry> getGuestBookEntries() {
		return guestBookEntries;
	}

	@Override
	public void insertEntry(String userName, String message) {
		GuestBookEntry guestBookEntry = new GuestBookEntry();
		guestBookEntry.setUserName(userName);
		guestBookEntry.setMessage(message);
		getGuestBookEntries().add(guestBookEntry);
		
		
	}





	
}

package com.alessio.danny.dao;

import java.util.Collection;

import com.alessio.danny.model.GuestBookEntry;

public interface EntryDao {
	
	Collection <GuestBookEntry> getGuestBookEntries();
	void insertEntry(String userName, String message);
	
}

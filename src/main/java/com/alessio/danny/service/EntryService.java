package com.alessio.danny.service;

import java.util.Collection;

import com.alessio.danny.model.GuestBookEntry;

public interface EntryService {

	Collection <GuestBookEntry> getGuestBookEntries();
	void insertEntry(String userName, String message);

}

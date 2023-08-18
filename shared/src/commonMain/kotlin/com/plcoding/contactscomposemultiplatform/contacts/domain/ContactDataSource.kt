package com.plcoding.contactscomposemultiplatform.contacts.domain

import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact
import kotlinx.coroutines.flow.Flow

interface ContactDataSource {
    fun getContacts(): Flow<List<Contact>>
    fun geRecentContacts(amount: Int): Flow<List<Contact>>
    suspend fun insertContact(contact: Contact)
    suspend fun deleteContact(id: Long)
}

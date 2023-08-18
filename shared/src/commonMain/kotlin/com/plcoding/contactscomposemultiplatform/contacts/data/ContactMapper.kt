package com.plcoding.contactscomposemultiplatform.contacts.data

import com.plcoding.contactscomposemultiplatform.common.data.ImageStorage
import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact
import database.ContactEntity

suspend fun ContactEntity.toContact(
    imageStorage: ImageStorage
): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) }
    )
}

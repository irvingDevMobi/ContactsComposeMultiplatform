package com.plcoding.contactscomposemultiplatform.di

import com.plcoding.contactscomposemultiplatform.common.data.ContactDatabase
import com.plcoding.contactscomposemultiplatform.common.data.DatabaseDriverFactory
import com.plcoding.contactscomposemultiplatform.common.data.ImageStorage
import com.plcoding.contactscomposemultiplatform.contacts.data.SqlDelightContactDataSource
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactDataSource

actual class AppModule {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}

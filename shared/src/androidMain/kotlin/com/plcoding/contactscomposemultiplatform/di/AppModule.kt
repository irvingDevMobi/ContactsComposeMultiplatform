package com.plcoding.contactscomposemultiplatform.di

import android.content.Context
import com.plcoding.contactscomposemultiplatform.common.data.ContactDatabase
import com.plcoding.contactscomposemultiplatform.common.data.DatabaseDriverFactory
import com.plcoding.contactscomposemultiplatform.common.data.ImageStorage
import com.plcoding.contactscomposemultiplatform.contacts.data.SqlDelightContactDataSource
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactDataSource

actual class AppModule(
    private val context: Context
) {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create()
            ),
            imageStorage = ImageStorage(context)
        )
    }
}

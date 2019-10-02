package example.com.byjusapp.app.database.news

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Akash on 2019-09-28.
 * This entity class for article source.
 */

@Entity
class SourceEntity(
    @PrimaryKey val id: Long,
    val name: String
) {}
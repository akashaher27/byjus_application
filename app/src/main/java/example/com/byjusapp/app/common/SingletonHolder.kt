package example.com.byjusapp.app.common

/**
 * Created by Akash on 2019-10-05.
 *
 * Generic implementation for class which provide singleton instance using argument.
 */
open class SingletonHolder<out T : Any, in A>(creator: (A) -> T) {

    private var instance: T? = null
    private var creator: ((A) -> T) = creator

    fun getInstance(arg: A): T {
        val i = instance
        if (i != null) {
            return i;
        }
        return synchronized(this) {
            val i2 = creator!!(arg)
            instance = i2
            i2
        }
    }
}

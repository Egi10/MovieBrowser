package id.co.buaja.common

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
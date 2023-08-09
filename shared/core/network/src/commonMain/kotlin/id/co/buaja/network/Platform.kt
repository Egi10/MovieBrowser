package id.co.buaja.network

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
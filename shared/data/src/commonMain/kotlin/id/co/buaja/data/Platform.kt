package id.co.buaja.data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
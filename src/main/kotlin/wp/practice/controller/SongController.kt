package wp.practice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import wp.practice.model.Song
import wp.practice.service.SongService

@RestController
class SongController(private val service: SongService) {
    val title = listOf("노래1", "노래2", "노래3")

    @GetMapping("/my_song/list")
//    fun getSongList(): List<String> {
//        return title
//    } -->를 간단화 하면 아래!

//    fun getSongList(): List<String> = title
//    -->더 간단화 하면 아래!

//    fun getSongList() = title

    fun getsongList(): List<Song>{
        return service.getAllSongs()
    }
}
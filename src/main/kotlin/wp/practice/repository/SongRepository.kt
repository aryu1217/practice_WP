package wp.practice.repository

import org.springframework.stereotype.Repository
import wp.practice.model.Song

@Repository
class SongRepository {
    val songs = listOf(
        Song(1,"Title1", "Singer1"),
        Song(2,"Title2", "Singer2"),
        Song(3,"Title3", "Singer3"),
        Song(4,"Title4", "Singer4"),
        Song(5,"Title5", "Singer5")
    )

    fun fetchSong() = songs
    fun getSong(index: Int) = songs[index]
//    fun getSize() = songs.size
    val songsSize: Int
        get() = songs.size //코틀린의 게터기능! 함수가아닌 변수처럼 사용가능하게 해줌

}
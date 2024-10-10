package wp.practice.service

import org.springframework.stereotype.Service
import wp.practice.model.Song
import wp.practice.repository.SongRepository
import kotlin.random.Random

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }

    fun getRandomSong(): Song{
        return repository.getSong(Random.nextInt(repository.songsSize))
    }
}
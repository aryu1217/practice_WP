package wp.practice.service

import org.springframework.stereotype.Service
import wp.practice.model.Song
import wp.practice.repository.SongRepository

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }
}
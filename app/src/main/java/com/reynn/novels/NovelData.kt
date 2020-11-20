package com.reynn.novels

object NovelData {
    val list: ArrayList<Novel>

    get(){
        val list: ArrayList<Novel> = arrayListOf()

        list.add(
            Novel(
            nama = "The Best Book of the Century",
            penulis = "Christian Lorentzen",
            keterangan = "Ask a set of writers and critics to select books for a new canon, and it shouldn’t come as a shock that the one most of them name is a novel about the nature of genius. It is also, more precisely, a novel about universal human potential.",
            gambar = "https://upload.wikimedia.org/wikipedia/en/6/6b/Harry_Potter_and_the_Philosopher%27s_Stone_Book_Cover.jpg",
            rating = 8.4
        )
        )

        list.add(
            Novel(
            nama = "The 12 New Classics",
            penulis = "Laura Miller",
            keterangan = "The Corrections, by Jonathan Franzen (September 1, 2001) | 6 votes\n" +
                    "Arriving in bookstores ten days before the September 11 attacks, The Corrections recounts the tragicomic breakdown of a 20th-century American dream of middle-ness: midwestern and middle-class. The Lamberts, with their mentally disintegrating patriarch, Christmas-obsessed mother, and grown siblings tackling depression, professional failure, adultery, and celebrity chefdom, may not seem as universal as they once did, but the sensation of certainties evaporating as we pitch headlong into this still-young century has only gotten stronger. ",
            gambar = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Fairy_Tales_%28Boston_Public_Library%29.jpg/440px-Fairy_Tales_%28Boston_Public_Library%29.jpg",
                    rating = 9.23
        )
        )

        list.add(
            Novel(
            nama = "Never Let Me Go",
            penulis = "Kazuo Ishiguro",
            keterangan = "You can think of this as Ishiguro’s The Road — his haunting masterpiece. The ratio of taut plot to ghastly subject matter is disturbingly effective. Kathy H.’s multidimensional but methodical storytelling of this adolescent Gothic horror show is indelible (and difficult to review without spoiling). The questions it raises are perfectly of-our-century. Never Let Me Go is a prime example of an author with impeccable taste in ideas and the control to execute them. Most authors are lucky if they have one of those things going for them. This novel is a rare symphony of both. —Sloane Crosley",
            gambar = "https://upload.wikimedia.org/wikipedia/en/a/a1/Neverletmegoposterquad.jpg",
                rating = 9.2

        )
        )

        list.add(
            Novel(
            nama = "How Should a Person Be?",
            penulis = "Sheita Heti",
            keterangan = "Heti doesn’t get enough credit from her advocates for being funny or from her critics for being serious. Slipping imperceptibly from ironic to earnest, challenging to chatty, her voice is sui generis and ideally suited to capturing the experience of making art — and decisions — in the modern world. The concerns of her breakout work of autofiction include sex, self-documentation, aesthetics, and friendship, as well as the titular question. The title is a perfect joke, a mission statement of deranged grandiosity, straight-faced and self-aware. Isn’t this what every book, ever, wants (in its own way) to ask?",
            gambar = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1329024487l/9361377.jpg",
                    rating = 8.55
        )
        )

        list.add(
            Novel(
            nama = "The Neapolitan Novels, by Elena Ferrante",
            penulis = "Mariz Kreizman",
            keterangan = "Elena Ferrante’s Italy is where the personal is political, the male gaze is visceral, and the past clings to the present with potent force. Across four books and over the lifetimes of its two unforgettable main characters, the Neapolitan quartet explores female rage, agency, and friendship with a raw power. (All that over a decade when women have begun to express their anger and agency in new ways.) Lila and Elena grow up inured to the violence and corruption that defines their hometown of Naples in the 1950s, even as they yearn for something better: beauty amidst the ugliness, and intellectual fulfillment, which can be as heady as romantic love. Ferrante fever struck readers all over the world, captivated by Lila and Elena’s complicated relationship.",
            gambar = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Littlelostchildsheetmusic.jpg/440px-Littlelostchildsheetmusic.jpg",
                    rating = 8.3
        )
        )

        list.add(
            Novel(
            nama = "The Argonauts, by Maggie Nelson",
            penulis = "Cananga odorata",
            keterangan = "Around the time it was published, Maggie Nelson read aloud the opening of this book — an extremely graphic and surprising sex scene, awkwardly lighting up that New York room and clanging a bell that people had just not heard before. Her 21st-century classic is structurally just that kind of awoke re-shuffling. It’s not that you don’t know about anal sex, childbirth, or even about a partner’s transition or a parent dying, but Nelson puts each next to the other in a manner that changes our perception of each and all. I’m always glad to have never had a baby, yet Maggie has writ birthing so deeply that I’m grateful to say I’ve missed nothing in this life, thanks to this uncanny saint of a book.",
            gambar = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Krater_Niobid_Painter_A_Louvre_G341.jpg/440px-Krater_Niobid_Painter_A_Louvre_G341.jpg",
                    rating = 7.8
        )
        )

        list.add(
            Novel(
            nama = "Atonement",
            penulis = "Iwan McEwan",
            keterangan = "At once a war story, a love story, and a story about the destructive and redemptive powers of the imagination, Atonement pivots around a terrible lie told by a 13-year-old girl that will shatter her family. At the same time, the novel opens out into a deeply moving portrait of England careerning from the quiescent 1930s into the horrors of World War II. A bravura account of the 1940 Allied retreat from Dunkirk stands as one of the most indelible combat scenes in recent literature, slamming home the confusion, terror, and banality of war with visceral immediacy. It is only the most memorable sequence in a brilliantly orchestrated novel that injects many of the author’s favorite themes — the hazards of innocence, the sudden intrusion of bad luck into ordinary lives, the blurring of lines between art and life — with a new resonance and depth.",
            gambar ="https://upload.wikimedia.org/wikipedia/en/e/e4/Atonement_UK_poster.jpg",
                    rating = 9.0
        )
        )

        list.add(
            Novel(
            nama = "2666",
            penulis = "Roberto Bolaño",
            keterangan = "Bolaño’s final legacy to the world before his death in 2003 is a labyrinthine mystery taking in three continents and most of the 20th century. Its playful first part might make you think you are stepping into a steady old-fashioned cruise ship of a novel, à la Victor Hugo, but the tone shifts as abruptly as the locale. At its center is the book-length fourth part, a mercilessly clipped recital of some of the hundreds of femicides in Ciudad Juárez, which is both integral to the story and a direct confrontation with the reader. The book is a world: teeming, immeasurable, unplumbable, materially solid but finally enigmatic.",
            gambar = "https://upload.wikimedia.org/wikipedia/en/2/2f/2666Novel.jpg",
                    rating = 9.8
        )
        )

        list.add(
            Novel(
            nama = "The Sellout",
            penulis = "Paul Beatty",
            keterangan = "It takes a master of language, culture, and comic timing to create a satire that excoriates contemporary American life, with jokes coming at a furious pace, almost line by line. The novel takes on the idea of living in a “post-racial” society, which even during the Obama administration was ridiculous. The Sellout details the trials of a black man charged with reinstating slavery and segregation in his California hometown, in a voice that is unabashedly profane; so unflinchingly silly and smart that it’s impossible to look away.",
            gambar = "https://upload.wikimedia.org/wikipedia/en/8/81/Sellout_by_Paul_Beatty.jpg",
                    rating = 9.21
        )
        )

        list.add(
            Novel(
            nama = "The Outline Trilogy",
            penulis = "Rachel Cusk",
            keterangan = "In its basic contours, Cusk’s trilogy is a masterpiece of rigorous denial: The books, mostly plotless, follow a British writer named Faye about whom we learn little. Yet Faye is less a protagonist than a character-shaped black hole, pulling stories and confessions out of everyone she encounters as if by inexorable gravitational force. Their disclosures allow Cusk to examine the ways we try (and fail) to make meaning out of life. The result is fiction like ice water, cold and clear, a mirror of our time.",
            gambar ="https://upload.wikimedia.org/wikipedia/en/8/87/15635_books_origjpg.jpg",
                    rating = 7.5
        )
        )


        return list
    }
}
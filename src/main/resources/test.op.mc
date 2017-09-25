intersect {
    exclude {
        item(1),
        item(2)
    },
    junction {
        intersect {
            item(5),
            item(6)
        },

        item(12) ,
        intersect {
            exclude {
                item(7),
                item(8)
            },
            intersect {
                item(9),
                exclude {
                    item(10),
                    item(11)
                }
            }
        },
        exclude {
            item(3),
            item(4)
        }
    }
}
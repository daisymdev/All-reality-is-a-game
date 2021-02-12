// Daisy Murillo Javascript practice with DOM -- Feb 11, 2021 

// let simpleLevelPlan = `
// ......................
// ..#................#..
// ..#..............=.#..
// ..#.........o.o....#..
// ..#.@......#####...#..
// ..#####............#..
// ......#++++++++++++#..
// ......##############..
// ......................`;


class Level {
    constructor(plan) {
        let rows = plan.trim().split("\n").map(l => [...l]);
        this.height = rows.length;
        this.width = rows[0].length;
        this.startActors = [];

        this.rows = rows.map((row, y) => {
            return row.map((ch, x) => {
                let type = levelChars[ch];
                if (typeof type == "string") return type;
                this.startActors.push(
                    type.create(new Vec(x, y). ch));
                return "empty";
            });
        });
    }
}
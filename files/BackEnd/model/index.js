const dbConfig = require("../config/db.config.js");

const Sequelize = require("Sequelize");
const Sequelize = new Sequelize(dbConfig.DB, dbConfig.USER,
dbConfig.PASSWORD, {
	host: dbConfig.HOST,
	dialect: dbConfig.dialect,
	operationsAliases: false,
	pool: {
	max: dbConfig.pool.max,
	min: dbConfig.pool.min,
	acquire: dbConfig.pool.acquire,
	idle: dbConfig.pool.idle
	}
});
const db = {};

db.Sequelize = Sequelize;
db.sequelize = sequelize;

db.tutorials = require("./tutorial.model.js") (sequelize, Sequelize);

module.exports = db;

const app = express();
app.use(express.json());

const db = require("./models");
db.sequelize.sync();

db.sequelize.sync({ force: true }).then(() => {

    console.log("Drop and resync db.");

});
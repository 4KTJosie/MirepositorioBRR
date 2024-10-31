from flask import Flask
from .config import Config
from .model import db, bcrypt
from .routes import auth

def create_app():
    app = Flask(__name__)
    app.config.from_object(Config)

    db.init_app(app)
    bcrypt.init_app(app)

    app.register_blueprint(auth, url_prefix='/api')

    with app.app_context():
        db.create_all()

    return app
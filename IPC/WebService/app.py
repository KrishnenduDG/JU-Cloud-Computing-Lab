from flask import Flask, jsonify, request

app = Flask(__name__)


@app.route("/")
def home():
    return jsonify({status: True, msg: "Success"})


@app.route("/api/data", methods=["GET"])
def add_data():
    n1 = request.args.get("number1")
    n2 = request.args.get("number1")

    return jsonify({"result": int(n1) + int(n2)})


app.run(debug=True, port=8000)

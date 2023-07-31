import styled from "styled-components";
import { useEffect, useRef } from "react";
import { OpenVidu, Publisher } from "openvidu-browser";

const SCam = styled.div`
  width: 200px;
  height: 200px;
  border: ${({ $border }) => ($border ? "2px solid red" : "none")};
`;

const UserCam = ({ onClick, isOn, border }) => {
  const publisherRef = useRef(null);
  const videoRef = useRef(null);

  useEffect(() => {
    if (isOn) {
      let OV = new OpenVidu();
      let publisher = OV.initPublisher(videoRef.current, {
        audio: true,
        video: true,
        quality: "MEDIUM",
        resolution: "200x200",
      });

      publisherRef.current = publisher;

      publisher.addVideoElement(videoRef.current);
    } else {
      if (publisherRef.current) {
        publisherRef.current.stream.dispose();
        publisherRef.current = null;
      }
    }
  }, [isOn]);

  return (
    <div>
      유저캠
      <SCam $isOn={isOn} $border={border}>
        <div ref={videoRef} />
      </SCam>
      <button onClick={onClick}>유저 입장 이벤트</button>
    </div>
  );
};

export default UserCam;